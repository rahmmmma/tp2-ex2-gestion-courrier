# tp2-ex2-gestion-courrier
taveaux pratique
nom:Rahma Hayder
nom:Loujain Saoud




## Diagramme de classes UML


classDiagram
    class Courrier {
        #boolean express
        #String adresse
        #double TARIF_BASE = 0.5
        +Courrier(boolean, String)
        +estValide() boolean
        +decrire() void
        +affranchir() double
    }
    class Lettre {
        -double poids
        -String format
        +Lettre(boolean, String, double, String)
        +decrire() void
        +affranchir() double
    }
    class Colis {
        -double poids
        -double volume
        +Colis(boolean, String, double, double)
        +decrire() void
        +affranchir() double
    }
    class BoiteCourrier {
        -Courrier[] courriers
        +BoiteCourrier(int)
        +affranchir() double
        +courriersInvalides() int
        +afficher() void
    }
    Courrier <|-- Lettre
    Courrier <|-- Colis
    BoiteCourrier o-- Courrier
