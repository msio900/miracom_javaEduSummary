-- 21_11_02
-- Ctrl+Shift+Enter


-- SELECT (Projection + Selection )
/* 
Projection : 컬럼명을 직접 지정함
			distinct 컬럼의 중복을 제거함

Selection : where절을 추가해서 원하는 행만 검색
			ORDER BY 정렬, ALIAS 지정방법

*/
/* 문제1. EMP 테이블에서 업무가 SALESMAN 사원과 사원의 이름이
       FORD인 사원의 이름, 업무, 급여를 검색 하시오.

*/
SELECT ename, job, sal
FROM emp
WHERE job='SALESMAN' or ename='FORD'; 


-- 위 결과에서 SAL값이 점점 높은 순으로 출력되도록 결과를 정렬
-- ORDER BY 절이 필요함.
-- 1) 절의 순서 : SELECT -> FROM -> WHERE -> -> ORDER BY
SELECT ename, job, sal
FROM emp
WHERE job='SALESMAN' or ename='FORD'
ORDER BY sal DESC; 

-- 문제 2.
-- EMP 테이블에서, 이름, 월급, 연봉을 출력, 이때 연봉순으로 내림차순 정렬
-- 1. 
SELECT ename, sal, sal*12 + comm
FROM emp
ORDER BY sal*12 + comm DESC; 

-- 2. Alias 를 지정 (as를 사용) 
SELECT ename, sal, sal*12 + comm as "Annual Salary"
FROM emp
ORDER BY sal*12 + comm DESC; 

-- 2-2. AS빼고
SELECT ename, sal, sal*12 + comm "Annual Salary"
FROM emp
ORDER BY sal*12 + comm DESC; 

-- 2-3. 원래는 한칸을 띄우고 바로 별칭을 붙이면 된다.
SELECT ename, sal, sal*12 + comm AnnualSalary
FROM emp
ORDER BY sal*12 + comm DESC; 


-- 정리 :: 1) 별칭을 지정할때, AS는 굳이 붙이지 않고 생략 가능함.  
-- 		  2) 별칭에 ""을 지정하는 경우 별칭에 공백이 있을때만

/*
null값에 대해서
sql에서 null값은 연산이 적용되지 않는 값이다.

null을 다른 값으로 치환해서 계산을 해야한다.
ifNull() 사용
ifNull(comm, 0) -- comm값이 null이 아니면 그대로 return, comm이 null이면 0으로 return

*/

SELECT ename, sal, sal * 12 + ifnull(comm , 0) AnnualSalary
FROM emp
ORDER BY sal*12 + comm DESC; 

/*
SQL의 3가지

DML :
1) INSERT INTO table명 VALUES(0,0,0,0);
2) DELETE FROM table명 WHERE EMPNO=7768;
	DELETE FROM table명; // table의 모든 데이터가 다 삭제...주의!
3) UPDATE table명 SET sal=2000 WHERE ename='SMITH';
4) SELECT * FROM table명; //모든 데이터를 가져옴
	SELECT * FROM table명 WHERE deptno=10;

*/

-- 1105 -- 
/*
limit
::
출력 갯수를 제한하는 기능
시작은 0부터...0, 5...상위 5개만 출력

*/
-- 문제 1. emp 테이블에서, sal가 가장 많은 사원 3명을 출력 (sal ORDER BY DESC)
SELECT * FROM emp ORDER BY sal DESC;
SELECT * FROM emp ORDER BY sal DESC limit 3; -- limit는 오라클에서는 사용할수 없음.

/*
SQL에서 NULL값은 제대로 다룰 수 있어야 한다.
1) null 값은 아직 정해지지 않았거나(미확정) / 자격이 없을때 사용되는 값
2) 0을 의미하는 값이 아니다.
3) 값이 없는 것도 아니다. 나름 의미를 가지는 값이다. ...1)에서 언급
4) 0과는 전혀 다른 값이기 때문에 비교, 연산 적용이 안된다.
--> = , != 연산자 사용 못한다.
--> +, -, *, / 사용 안된다. 대신에 ifNull()을 사용해서 값을 치환시키고 연산 적용 가능.
*/

-- 문제2. emp테이블에서 comm을 받지 않는 사원을 검색..이름, 업무, comm이 출력
SELECT ename, job, comm FROM emp WHERE comm=null; -- 비교연산자 = 사용안됨.
SELECT ename, job, comm FROM emp WHERE comm is null;
SELECT ename, job, comm FROM emp WHERE comm is not null;
SELECT sal, sal * 12+ ifnull(comm, 0) AnnualSalary FROM emp;

/*
숫자함수 : abs() - 절대값 출력, round(), floor()-소숫점 버리기, mod() ... 

문자함수 : concat(), substr(), trim()

날짜함수 : now(), sysdate(), curdate(), year(), month()

*/

-- 문제3. 업무가 사장인 사람과 업무가 SALESMAN 인 사람의 급여 차리를 출력
SELECT * FROM emp;
SELECT sal FROM emp WHERE job="PRESIDENT"; -- 5000 : one row, one column 스칼라 값 스칼라 서브쿼리
SELECT sal FROM emp WHERE job="SALESMAN"; -- 1600, 1250, 1250, 1500

SELECT DISTINCT ABS((SELECT sal FROM emp WHERE ename="KING") - 
(SELECT sal FROM emp WHERE ename="ALLEN")) 급여차이
FROM emp;

SELECT ABS((SELECT sal FROM emp WHERE job="PRESIDENT") - 
sal) 급여차이
FROM emp
WHERE job="SALESMAN";


-- 문제 4. 사원 번호 중에서 홀수 번호만 출력 -- mod
SELECT ename, empno, job FROM emp WHERE MOD(empno, 2) = 1;

SELECT ROUND(45.923); -- 46 (소숫점 첫번째 자리에서 반올림이 진행됨.)
SELECT ROUND(45.923,2); -- 45.92 소숫점 두번째까지 출력을 의미.(...)

SELECT now() today;
SELECT sysdate() today;
SELECT curdate() today;

-- 문제 5. emp테이블에서 사원들의 입사년도를 출력, 이때 사원의 이름과 함께 출력, 별칭 부여alter
-- year() 사용
SELECT * FROM emp;
SELECT ename, year(hiredate) 입사년도 FROM emp;
SELECT ename, month(hiredate) 입사월 FROM emp;
SELECT ename, substr(hiredate, 6, 2) 입사월 FROM emp; -- 인덱스 0 마지막 인덱스는 포함 안됨. 두번째 : 시작위치, 세번째 : 글자길이

/*
like 연산자와 와일드 카드
ex) 훈련생들 중 김씨로 시작하는 학생들의 면단을 검색...
	제품 들 중에서 삼성 2글자 포함되는 모든 제품을 검색...
    
    와일드 카드 : %(0~여러개), _(정확하게 1:1 매핑) 
    
*/
SELECT ename FROM emp;
-- 사원 이름 중에서 S로 시작하는 사원의 이름을 검색
SELECT ename FROM emp WHERE ename LIKE 'S%';

-- 문제 6. 사원의 이름 중에서 두번째 철자가 A 인 사원을 검색
SELECT ename FROM emp WHERE ename LIKE '_A%';

-- 사원의 이름 중에서 R 철자가 포함된 모든 사원을 검색
SELECT ename FROM emp WHERE ename LIKE '%R%';




















