# Plan: Libro "La Conquista de la Galaxia"

## Contexto

El usuario quiere escribir un libro de ciencia ficción épica (Space Opera) usando ficheros markdown dentro del repositorio `universe/book/`. La carpeta ya existe. El objetivo de este plan es definir tanto el concepto inicial del libro como la metodología de trabajo para desarrollarlo de forma iterativa.

---

## Concepto del libro

| Elemento | Decisión |
|---|---|
| Género | Ciencia ficción épica / Space Opera |
| Narrador | Un civil ordinario, sin agenda política, arrastrado por los eventos |
| Galaxia al inicio | Fragmentada: decenas de civilizaciones pequeñas e independientes |
| El conquistador | Una coalición de varias razas que impone su orden |
| Final | Abierto — se decidirá al desarrollar personajes y trama |

**Idea central:** Un individuo anónimo, sin poder ni relevancia política, queda atrapado en medio de la conquista cuando la coalición llega a su mundo. Su historia personal se convierte en el hilo que conecta los grandes eventos épicos de la galaxia.

---

## Metodología de trabajo

### Fase 1 — Biblia del mundo (worldbuilding)
Antes de escribir ningún capítulo, construir los documentos de referencia:
- Lore del universo y su historia
- Facciones y civilizaciones
- Personajes principales
- Tecnología y reglas del mundo

### Fase 2 — Estructura narrativa
Con la biblia como base, definir:
- Actos y arcos narrativos
- Puntos de giro principales
- Arco del protagonista

### Fase 3 — Escritura por capítulos
Un fichero por capítulo: `chapter-01.md`, `chapter-02.md`, etc.

---

## Estructura de ficheros en `book/`

```
book/
├── bible/
│   ├── world.md          # Historia galáctica, contexto, tecnología
│   ├── factions.md       # La coalición conquistadora + civilizaciones de la galaxia
│   ├── characters.md     # Protagonista, antagonistas, secundarios
│   └── rules.md          # Física, viaje espacial, reglas del universo
├── outline/
│   └── structure.md      # Actos, arcos, puntos de giro
└── chapters/
    └── chapter-01.md     # (cuando llegue el momento)
```

---

## Primeros pasos (tras aprobar el plan)

1. Crear la estructura de carpetas en `book/`
2. Empezar con `bible/world.md` — historia galáctica y contexto de la conquista
3. Continuar con `bible/factions.md` — quiénes son los conquistadores (la coalición) y los mundos que conquistan
4. Luego `bible/characters.md` — construir al protagonista civil desde cero

---

## Cómo verificar el avance

- Revisar los ficheros markdown generados en `book/bible/`
- Cada sesión debería terminar con al menos un fichero de la biblia más completo
- El paso a `outline/structure.md` solo cuando la biblia tenga suficiente base
