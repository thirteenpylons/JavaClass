### START

    __Prompt__ the user for pet type (Dog or Cat)
    IF pet type is Dog THEN
        Check if dogSpaces < 30
        IF space available THEN
            __Prompt__ for pet information (Name, Age, etc.)
            Ask if pet is returning
                IF returning THEN
                    __Prompt__ for any updates to pet information
                ELSE
                    Collect new pet information
            __Prompt__ for length of stay
            IF length of stay >= 2 THEN
                __Prompt__ for grooming service
            Assign dog to a space
            __Display__ confirmation message with assigned space
        ELSE
            __Display__ "No space available for dogs."
        END IF
    ELSE IF pet type is Cat THEN
        Check if catSpaces < 12
        IF space available THEN
            __Prompt__ for pet information (Name, Age, etc.)
            Ask if the pet is returning
            IF returning THEN
                __Prompt__ for any updates to pet information
            ELSE 
                Collect new pet information
            __Prompt__ for length of stay
            Assign cat to a space
            __Display__ confirmation message with assigned space
        ELSE
            __Display__ "No space available for cats."
        END IF
    ELSE
        __Display__ "Invalid pet type."
    END IF

### END