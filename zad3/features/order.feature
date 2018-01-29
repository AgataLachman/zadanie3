@Order

Feature:

  Scenario: Submit an order
    Given I  on start page
    When I click “Sign in” button
    And I enter the email address as "agata@op.pl" and password as "agata"
    And I click button ,,Sign in"
    And I go on start page
    And I go on "Woman" cart
    And I click first product
    And I click button 'Add to cart'
    And I click button 'Proceed to checkout'
    And I click button 'Proceed to checkout' again
    And I click button  'Proceed to checkout'
    And I agree to the terms of service
    And I click  button 'Proceed to checkout'
    And I click button 'Pay by check'
    And I click button ' confirm my order'
    Then My Order on My Store is complete and message "Your order on My Store is complete." is displayed




