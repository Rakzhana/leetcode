-- Last updated: 25/07/2026, 15:15:25
/* Write your PL/SQL query statement below */
SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%'