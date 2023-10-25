@DB20
Feature: US20_Tesacher_meet_create
  Scenario: US20 Teacher meet olusturabilir
    Given Database baglanir
    When MeetId aracılıgıyla bilgilere ulasilir
    Then Date,description,start_time,stop_time dogrulanir
    Then Bilgilerin güncel olduğunu dogrula
    Then Bilgilerin db kısmından silindigini dogrula
