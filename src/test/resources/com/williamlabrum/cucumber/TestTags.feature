Feature: Test Example Tags
    
    Scenario Outline: Test Tags in Example Blocks
        Given some "<column>"
        When bar
        Then fizz
    
    @myTag    
    Examples:
    | column    |
    | some data |
    
    @myTag2
    Scenario Outline: Test Tags in Example Blocks
        Given some "<column>"
        When bar
        Then fizz
            
    Examples:
    | column    |
    | some data |
    