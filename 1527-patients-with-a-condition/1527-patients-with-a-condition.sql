# DIAB1 단어로 시작해야함. 단어 사이에 DIAB1 껴있는 경우 제외해야함

SELECT * 
FROM Patients
WHERE conditions LIKE "% DIAB1%" OR conditions LIKE "DIAB1%"