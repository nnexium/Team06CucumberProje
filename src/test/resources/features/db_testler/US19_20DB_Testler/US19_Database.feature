@DB19
Feature: US19_Tesacher_meet_create
  Scenario: US19_TC01 Teacher meet olusturabilir
    Given Database baglanir
    When MeetId aracılıgıyla bilgilere ulasilir
    Then Date,description,start_time,stop_time dogrulanir
