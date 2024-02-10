This principle states that high-level modules should not depend on low-level modules. Both should depend
on abstractions. Also, abstractions should not depend on details. Details should depend on abstractions.
This principle is the foundation of Dependency injection, a popular technique in modern frameworks.

Use Cases

1. Consider a class `PasswordReminder` that sends password reminders and connects directly to a
MySQL database. If we want to change the database to MongoDB, we would have to modify `PasswordReminder`.
2This violates DIP. A better approach would be to have `PasswordReminder` depend on an interface
`DatabaseConnection`. We can then have our `MySQLConnection` and `MongoDBConnection` classes implement
`DatabaseConnection`.

2. In a notification system, rather than having a `NotificationSender` directly instantiate an
`EmailService` to send email notifications, it would be better to have `NotificationSender` depend on a
`NotificationService` interface. Then, `EmailService` can implement `NotificationService`, and if later you
want to add an `SMSService`, it can also implement `NotificationService`. This way, `NotificationSender` is
decoupled from specific notification methods and is more flexible to changes.
