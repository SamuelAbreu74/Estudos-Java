```mermaid
erDiagram
    DEPARTAMENTO ||--o{ FUNCIONARIO : "possui"
    DEPARTAMENTO {
        int ID_Departamento PK
        varchar Setor UNIQUE
    }
    FUNCIONARIO {
        int ID_Funcionario PK
        varchar Nome
        date Data_Nascimento
        decimal Salario
        int ID_Departamento FK
    }
```
