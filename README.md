# Smart Workflow Rule Engine

## Overview
A configurable rule engine platform that allows dynamic rule creation, evaluation, and execution logging.

## Tech Stack
- Backend: Spring Boot (Java 21)
- Database: PostgreSQL
- Frontend: React
- Documentation: Swagger/OpenAPI

## Architecture
Layered Architecture:
Controller → Service → Repository → Database

## Setup Instructions

### Backend
cd backend
mvn clean install
mvn spring-boot:run

### Frontend
cd frontend
npm install
npm start

## Environment Variables
Create .env files for backend and frontend.

## Branching Strategy
- main → production
- develop → integration
- feature/* → features
- bugfix/* → fixes
