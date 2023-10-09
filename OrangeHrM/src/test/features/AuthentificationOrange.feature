@tag
Feature: Authentification page orange hrm

  @tag1
  Scenario: Authentification valide pageorange hrm
    Given saisir l url page orange "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir le login del page orange "Admin"
    And saisr le motpass de la page orange "admin123"
    And cliquer sur le bouton login dans la page orange
    Then verifier le nom de profil affichee "Paul Collings"
