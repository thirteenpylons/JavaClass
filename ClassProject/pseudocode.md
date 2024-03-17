### START

    **Prompt** the user for pet type (Dog or Cat)
    IF pet type is Dog THEN
        Check if dogSpaces < 30
        IF space available THEN
            **Prompt** for pet information (Name, Age, etc.)
            Ask if pet is returning
                IF returning THEN
                    **Prompt** for any updates to pet information
                ELSE
                    Collect new pet information
            **Prompt** for length of stay
            IF length of stay >= 2 THEN
                **Prompt** for grooming service
            Assign dog to a space
            **Display** confirmation message with assigned space
        ELSE
            **Display** "No space available for dogs."
        END IF
    ELSE IF pet type is Cat THEN
        Check if catSpaces < 12
        IF space available THEN
            **Prompt** for pet information (Name, Age, etc.)
            Ask if the pet is returning
            IF returning THEN
                **Prompt** for any updates to pet information
            ELSE 
                Collect new pet information
            **Prompt** for length of stay
            Assign cat to a space
            **Display** confirmation message with assigned space
        ELSE
            **Display** "No space available for cats."
        END IF
    ELSE
        **Display** "Invalid pet type."
    END IF

### END