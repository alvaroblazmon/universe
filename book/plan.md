# Plan: El Velo — Universo Narrativo

## Concepto

**El Velo** es un universo narrativo de ciencia ficción épica (Space Opera). No es un libro — es el telón de fondo sobre el que se cuentan muchas historias individuales en distintas épocas, con distintos protagonistas y conflictos.

Referentes de escala: *Foundation* de Asimov, *Dune* de Herbert, el universo Marvel/DC.

---

## El universo

| Elemento | Decisión |
|---|---|
| Género | Ciencia ficción épica / Space Opera |
| Escala temporal | Miles de siglos — escala cósmica |
| Galaxia | El Velo — fragmentada, asimétrica, con civilizaciones de distintas eras |
| Tono | Épico, humano, con perspectiva de civil ordinario |

Las civilizaciones, facciones, reglas del universo y geografía galáctica están documentadas en `book/world/`.

---

## Metodología de trabajo

### Nivel 1 — Worldbuilding (universo)
Documentos de referencia que aplican a todas las historias:
- Civilizaciones y facciones
- Geografía galáctica
- Reglas físicas y tecnológicas
- Historia galáctica

### Nivel 2 — Historia individual
Cada historia tiene su propia biblia y estructura narrativa:
- Personajes principales y secundarios
- Arcos narrativos y puntos de giro
- Contexto temporal dentro del universo

### Nivel 3 — Escritura por capítulos
Un fichero por capítulo dentro de la carpeta de cada historia.

---

## Estructura de ficheros en `book/`

```
book/
├── world/                    # Worldbuilding del universo (aplica a todas las historias)
│   ├── galaxia.md            # El Velo, geografía, escala temporal
│   ├── el-dominio.md         # La gran potencia conquistadora
│   ├── los-sofari.md         # Civilización filosófica fragmentada
│   ├── los-fines.md          # Los humanos — facciones sin gobierno único
│   ├── los-tyr.md            # Humanos comerciantes y tecnológicos
│   └── los-pyrron.md         # Civilización antigua del brazo exterior
├── stories/                  # Una carpeta por historia
│   └── historia-01/          # Primera historia (el protagonista civil)
│       ├── characters.md     # Personajes de esta historia
│       ├── structure.md      # Actos, arcos, puntos de giro
│       └── chapters/
│           └── chapter-01.md
└── rules.md                  # Física, viaje espacial, reglas del universo
```

---

## Estado actual

- [x] Worldbuilding base completado (`book/world/`)
- [ ] Reglas del universo (`rules.md`)
- [ ] Primera historia: personajes
- [ ] Primera historia: estructura narrativa
- [ ] Primera historia: escritura de capítulos

---

## Primera historia

Un civil ordinario, desterrado desde pequeño junto a su primo en una colonia de frontera de Los Fines. Destacan en escaramuzas locales. Su historia personal se convierte en el hilo que conecta los grandes eventos del brazo exterior.

Situada en los primeros siglos de expansión humana — cuando Los Fines son jóvenes y el Velo empieza a notar su presencia.
