package com.example.contractapp.command;

import com.example.contractapp.model.entity.*;
import com.example.contractapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {


    @Autowired
    CurrencyTypeRepository currencyTypeRepository;

    @Autowired
    PayerRepository payerRepository;

    @Autowired
    ConditionRepository conditionRepository;

    @Autowired
    StatusConsumerRepository statusConsumerRepository;

    @Autowired
    BelongingRepository belongingRepository;

    @Autowired
    ActivityRepository activityRepository;

    @Autowired
    GuidanceDocumentTypeRepository guidanceDocumentTypeRepository;

    @Override
    public void run(String... args) throws Exception {

        List<CurrencyType> currencyTypes = new ArrayList<>(Arrays.asList(
                new CurrencyType(null, "sum"),
                new CurrencyType(null, "dollar")
        ));

        currencyTypeRepository.saveAll(currencyTypes);


        Condition condition = new Condition(null, "active");
        Condition condition1 = new Condition(null, "inactive");
        conditionRepository.save(condition);
        conditionRepository.save(condition1);


        List<StatusConsumer> statusConsumers = new ArrayList<>(Arrays.asList(
                new StatusConsumer(null, "muhim"),
                new StatusConsumer(null, "juda muhim"),
                new StatusConsumer(null, "direktiv")
        ));

        statusConsumerRepository.saveAll(statusConsumers);


        List<Belonging> belongings = new ArrayList<>(Arrays.asList(
                new Belonging(null, "idoraviy"),
                new Belonging(null, "idoraviy bo'lmagan")
        ));
        belongingRepository.saveAll(belongings);


        List<Activity> activities = new ArrayList<>(Arrays.asList(
                new Activity(null, "operator"),
                new Activity(null, "provayder")
        ));
        activityRepository.saveAll(activities);

        List<GuidanceDocumentType> guidanceDocuments = new ArrayList<>(Arrays.asList(
                new GuidanceDocumentType(null, "nizom"),
                new GuidanceDocumentType(null, "pozitsiya")
        ));
        guidanceDocumentTypeRepository.saveAll(guidanceDocuments);




    }
}
