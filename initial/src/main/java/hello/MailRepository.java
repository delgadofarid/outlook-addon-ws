package hello;

import org.springframework.data.repository.CrudRepository;

import hello.Mail;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MailRepository extends CrudRepository<Mail, Long> {

}
