A class should only have one responsibility and only have one reason to change.

Class should only have one job.

How does this principle help us to build better software?

1. Testing – A class with one responsibility will have far fewer test cases.
2. Lower coupling – Less functionality in a single class will have fewer dependencies.
3. Organization – Smaller, well-organized classes are easier to search than monolithic ones.


Use Cases

1. In a payroll system, have separate classes for calculating the salary, generating paylsips, and
depositing the salary into the bank
2. Consider a class `ReportGenerator` that generates reports and also formats the reports. which violates
SRP since it has two responsibilities. a Better approach have two classes `ReportGenerator` and `ReportFormatter`.

