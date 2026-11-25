# Laboratory 06 — Fragments & Navigation Practice

- **Author:** Daniela del Carmen Maldonado Bedolla
- **Date:** November 25, 2026
- **Course:** Mobile Application Development (AGH University of Kraków)

## Overview

Android lab practice built in Kotlin using **View Binding** and **Jetpack Navigation Component** to handle multi-fragment navigation and launch a secondary activity (`SecondActivity`) with interactive UI and system feedback actions.

## Implemented Features & Changes

* Configured the navigation graph (`nav_main.xml`) and `NavController` actions to move between the main fragment and secondary fragments (`second` and `third`), as well as return through the navigation stack.
* Replaced direct view lookups with View Binding (`*Binding`) in activities and fragments for safer layout interaction.
* Implemented `SecondActivity` with actions to write logs to **LogCat**, display **Toast** messages, update text inside an `EditText`, and close the activity with `finish()` to return to the previous screen.
* Organized and migrated the project files from the root workspace into the `Laboratory-06-FragmentsNavigationPractice/` directory inside the `Mobile-App-Development` repository while preserving Git commit history.

> **Note on Evidence & Screenshots:** Step-by-step execution screenshots and visual evidence of the lab procedure are stored in the `Anex` folder (`Anex/`).
