Feature: Activity
  Background:
    When Call Activity API

  Scenario: check status code
    Then Assert status code is 200

  Scenario: Check Response Schema
      Then Assert the activity is Teach your dog a new trick
      And Assert the Type is relaxation