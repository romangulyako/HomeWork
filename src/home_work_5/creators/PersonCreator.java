package home_work_5.creators;

import home_work_5.api.ICreator;
import home_work_5.api.IGenerator;
import home_work_5.dto.Person;

public class PersonCreator implements ICreator<Person> {
    private IGenerator nickGenerator;
    private IGenerator passGenerator;
    private IGenerator nameGenerator;

    public PersonCreator(IGenerator nickGenerator, IGenerator passGenerator, IGenerator nameGenerator) {
        this.nickGenerator = nickGenerator;
        this.passGenerator = passGenerator;
        this.nameGenerator = nameGenerator;
    }

    @Override
    public Person create() {
        return new Person(nickGenerator.generate(), passGenerator.generate(), nameGenerator.generate());
    }
}
