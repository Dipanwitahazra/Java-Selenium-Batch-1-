Feature: Purchase process

  Scenario: Purchase multiple products and place order
     Given User is on the Demoblaze homepage
     When User selects category "Phones"
     And User selects product "Samsung galaxy s6"
     And User adds product to cart
     And User selects category "Laptops"
     And User selects product "Sony vaio i5"
     And User adds product to cart
     And User is on the cart page
     When User places an order with name "Dipanwita", country "India", city "Kolkata", card "1234567890123456", month "12", year "2025"
     Then User should see order confirmation