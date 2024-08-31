package home_work_5.creators;

import home_work_5.api.ICreator;
import home_work_5.api.IGenerator;
import home_work_5.dto.Person;
import home_work_5.exceptions.NullArgumentException;

public class PersonCreator implements ICreator<Person> {
    private final IGenerator nickGenerator;
    private final IGenerator passGenerator;
    private final IGenerator nameGenerator;

    public PersonCreator(IGenerator nickGenerator, IGenerator passwordGenerator, IGenerator nameGenerator) {
        NullArgumentException.check(nickGenerator);
        NullArgumentException.check(passwordGenerator);
        NullArgumentException.check(nameGenerator);

        this.nickGenerator = nickGenerator;
        this.passGenerator = passwordGenerator;
        this.nameGenerator = nameGenerator;
    }

    @Override
    public Person create() {
        return new Person(nickGenerator.generate(), passGenerator.generate(), nameGenerator.generate());
    }
}
