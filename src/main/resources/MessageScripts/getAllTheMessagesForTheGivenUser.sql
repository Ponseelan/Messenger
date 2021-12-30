select sender.name Sender,Messages.* from Messages
inner join Users
on toid=Users.Id
AND Users.id=userId
inner join Users sender
AND sender.id=fromid