Room ( id, No, type, price)
Guest ( id, name, email, phoneNo, room_booked)
Admin ( id, name, email, phoneNo)
Food ( id, name, price, type)

Fds for the above relations:

R.No->type, price, status

G.phoneNo->id, name, email, room_booked, due_amount

A.phoneNo->id, password, name, email

F.name-> id, price, type

All Relation are in 3NF
