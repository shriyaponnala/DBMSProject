bookguestroom(roomNo, Pno)
UPDATE Guest
SET room_booked = roomNo
WHERE phoneNo = Pno 

getadminbyPno(Pno)
SELECT * FROM Admin WHERE phoneNo = Pno

getguestbyPno(Pno)
SELECT * FROM Guest WHERE phoneNo = Pno
