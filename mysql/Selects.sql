-- 1) Retrieve all tickets along with the assigned administrator's username:
SELECT t.ticket_id, t.customer_name, t.ticket_description, t.ticket_status, t.ticket_priority, a.username AS assigned_administrator
FROM tickets t
INNER JOIN administrators a ON t.assigned_to = a.admin_id;

-- 2) Retrieve all tickets with their assigned administrators, including tickets with no assigned administrator:

SELECT t.ticket_id, t.customer_name, t.ticket_description, t.ticket_status, t.ticket_priority, a.username AS assigned_administrator
FROM tickets t
LEFT JOIN administrators a ON t.assigned_to = a.admin_id;

-- 3) Retrieve tickets assigned to a specific administrator (e.g., admin with ID 1):

SELECT t.ticket_id, t.customer_name, t.ticket_description, t.ticket_status, t.ticket_priority, a.username AS assigned_administrator
FROM tickets t
INNER JOIN administrators a ON t.assigned_to = a.admin_id
WHERE a.admin_id = 2;


