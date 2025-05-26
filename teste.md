```mermaid
erDiagram
    DEPARTAMENTO ||--o{ FUNCIONARIO : possui
    DEPARTAMENTO {
        int ID_Departamento PK
        varchar(100) Setor UNIQUE
    }
    FUNCIONARIO {
        int ID_Funcionario PK
        varchar(100) Nome
        date Data_Nascimento
        decimal(10,2) Salario
        int ID_Departamento FK
    }
```
