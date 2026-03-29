# CLAUDE.md — Guía de trabajo para El Velo

Este fichero describe cómo trabajar en el desarrollo del universo narrativo **El Velo**.

---

## Sobre el proyecto

**El Velo** es un universo narrativo de **ciencia ficción épica (Space Opera)**. No es un libro único — es el telón de fondo sobre el que se cuentan muchas historias individuales en distintas épocas y con distintos protagonistas.

El plan completo está en [`plan.md`](./plan.md).

---

## Estructura de carpetas

```
book/
├── world/          # Worldbuilding del universo (aplica a todas las historias)
├── stories/        # Una carpeta por historia individual
│   └── historia-01/
│       ├── characters.md
│       ├── structure.md
│       └── chapters/
└── rules.md        # Física, viaje espacial, reglas del universo
```

---

## Flujo de trabajo

1. **Worldbuilding primero** — Antes de desarrollar cualquier historia, el universo base debe estar sólido. Los ficheros de `world/` son la referencia.
2. **Consistencia** — Cualquier decisión nueva (nombre, tecnología, evento) debe reflejarse en el fichero de `world/` correspondiente.
3. **Historias independientes** — Cada historia en su propia carpeta dentro de `stories/`, con sus propios personajes y estructura narrativa.
4. **Un capítulo a la vez** — Al escribir, trabajar solo en el capítulo actual hasta cerrarlo.

---

## Convenciones de ficheros

- Worldbuilding: `world/*.md`
- Reglas del universo: `rules.md`
- Personajes por historia: `stories/historia-XX/characters.md`
- Estructura por historia: `stories/historia-XX/structure.md`
- Capítulos: `stories/historia-XX/chapters/chapter-01.md`, etc.
- Todos los ficheros en español.

---

## Estado actual

- [x] Worldbuilding base completado (`book/world/`)
- [ ] Reglas del universo (`rules.md`)
- [ ] Primera historia: personajes
- [ ] Primera historia: estructura narrativa
- [ ] Primera historia: capítulos

---

## Civilizaciones del Velo

| Nombre | Tipo | Símil histórico |
|--------|------|-----------------|
| **El Dominio** | Gran potencia conquistadora | Persia |
| **Los Sofari** | Civilización filosófica fragmentada | Grecia post-Peloponeso |
| **Los Fines** | Humanos — facciones sin gobierno único | Roma temprana |
| **Los Tyr** | Humanos — red comercial y tecnológica | Cartago |
| **Los Pyrron** | Civilización antigua del brazo exterior | Épiro de Pirro |
