# Proof-of-Concept SOA Webshop

Deze repository bevat alle code die is gebruikt tijdens het onderzoek naar het verschil tussen service-oriented architecture en [event-driven architecture](https://github.com/JoranVanBelle/EDA_Webshop). Dit project is tot stand gekomen na het vergelijken van de resultaten tussen de [event-driven architecture](https://github.com/JoranVanBelle/EDA_Webshop) en de door JHipster gegenereerde [service-oriented architecture](https://github.com/JoranVanBelle/JHipster_webshop) waaruit bleek dat de resultaten van beide projecten erg hard van elkaar verschillen.

## Inhoud

Deze repository bevat volgende bestanden:
  1. De source code om de architectuur op te bouwen
  2. Een docker-compose file en Dockerfile om de architectuur in docker te runnen
  3. De scenario's die met behulp van Gatling uitgevoerd kunnen worden

## Starten

Om de architectuur te kunnen runnen in docker dienen volgende stappen uitgevoerd te worden in een terminal die zich bevindt in de root van het project:
  1. Het maven-project builden
    1.1 Windows: ``.\mvnw clean package``
    1.2 Linux/MacOS: ``mvn clean package``
  
  2. De dockerimage maken
    2.1 ``docker build --tag=soa-webshop:latest .``
  
  3. De containers opzetten en runnen
    3.1 docker-compose up

Vooraleer de test kan gerunt worden, is het belangrijk om de databank te populaten. Dit kan gedaan worden met behulp van de sql-code in de resource-directory. Vooraleer deze statements uitgevoerd kunnen worden is het belangrijk dat de webshop-klasse aan het runnen is.