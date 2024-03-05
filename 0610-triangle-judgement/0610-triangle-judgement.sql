# Write your MySQL query statement below
# 삼각형 조건 : 가장 긴 변의 길이가 나머지 두 변의 길이보다 작아야한다.


SELECT x,y,z, if(x+y>z and x+z>y and y+z>x, 'Yes', 'No') as triangle
FROM triangle