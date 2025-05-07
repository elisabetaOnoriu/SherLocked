# SherLocked

Sherlocked is a full-stack web application designed to help detectives and investigators manage complex criminal cases. Built with Java, Spring Boot, and Thymeleaf, this project simulates real-world investigation workflows including suspect tracking, witness testimonies, evidence handling, and case timeline management.

# Features

🗂️ Create, update, and archive investigation cases

🧑‍💼 Add and manage suspects, witnesses, and investigators

🧾 Attach testimonies and evidence (with image upload support)

📍 Manage detailed locations (with city, country, coordinates)

🕰️ Track events in each case via a chronological timeline

🔗 Visualize and store connections between people and cases

🧠 Blood type management and status filtering

🧩 Extendable architecture for intelligent data analysis


# Tech Stack

Backend: Java 17, Spring Boot, Spring MVC, Spring Data JPA

Frontend: Thymeleaf, HTML/CSS, Bootstrap (optional)

Database: H2 (in-memory, for dev), MySQL (for prod)

Other: Lombok, MultipartFile (for file upload), Enum mapping


# Sample Functionality

Create Case → Add suspects, assign investigator

Add Evidence → Upload photo + description

Attach Testimony → Link to witness or suspect

Timeline → View key events in chronological order

Location Centering → Highlight the hotspot location of a case

