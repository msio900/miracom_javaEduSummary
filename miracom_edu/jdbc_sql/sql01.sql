-- SELECT (Projection + Selection )
/* 
Projection : 컬럼명을 직접 지정함
			distinct 컬럼의 중복을 제거함

Selection : where절을 추가해서 원하는 행만 검색
			ORDER BY 정렬, ALIAS 지정방법

*/
/* 문제1. EMP 테이블에서 업무가 salesman 사원과 사원의 이름이 
		ㄲ
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
SELECT ename, sal, sal*12 + comm
FROM emp
ORDER BY sal*12 + comm DESC; 
