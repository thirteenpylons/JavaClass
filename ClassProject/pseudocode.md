### START

    **_Prompt_** the user for pet type (Dog or Cat)
    IF pet type is Dog THEN
        Check if dogSpaces < 30
        IF space available THEN
            **_Prompt_** for pet information (Name, Age, etc.)
            Ask if pet is returning
                IF returning THEN
                    **_Prompt_** for any updates to pet information
                ELSE
                    Collect new pet information
            **_Prompt_** for length of stay
            IF length of stay >= 2 THEN
                **_Prompt_** for grooming service
            Assign dog to a space
            **Display** confirmation message with assigned space
        ELSE
            **Display** "No space available for dogs."
        END IF
    ELSE IF pet type is Cat THEN
        Check if catSpaces < 12
        IF space available THEN
            **_Prompt_** for pet information (Name, Age, etc.)
            Ask if the pet is returning
            IF returning THEN
                **_Prompt_** for any updates to pet information
            ELSE 
                Collect new pet information
            **_Prompt_** for length of stay
            Assign cat to a space
            **Display** confirmation message with assigned space
        ELSE
            **Display** "No space available for cats."
        END IF
    ELSE
        **Display** "Invalid pet type."
    END IF

### END