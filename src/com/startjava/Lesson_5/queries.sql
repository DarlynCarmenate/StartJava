--show the table
SELECT * FROM Jaegers;
--show all destroyed robots
SELECT * FROM Jaegers
    WHERE status != 'destroyed';
--show robots with mark-1 and mark-4
SELECT * FROM Jaegers
    WHERE mark IN ('mark-1', 'mark-4');
--show all robots except mark-1 and mark-4
SELECT * FROM Jaegers
    WHERE mark NOT IN ('mark-1', 'mark-4');
--show robots ordered by mark descending
SELECT * FROM Jaegers
    ORDER BY mark DESC;
--the oldests robot
SELECT * FROM Jaegers
    WHERE launch = (SELECT MIN(launch) FROM Jaegers);
--robot killed max kaiju
SELECT * FROM Jaegers
    WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);
--average weight of robots
SELECT AVG(weight) FROM Jaegers;
--show undestroyed robots
SELECT modelName, mark, height, weight, status, origin, launch, (kaijuKill + 1) AS kaijuPLUS FROM Jaegers
    WHERE status != 'destroyed';
--delete destroyed robots
--DELETE FROM Jaegers
    --WHERE status = 'destroyed';

