import models.InsuredData;
import org.junit.Test;
import steps.*;

import java.util.HashMap;

public class InsuranceTravelTest extends BaseSteps {
    NavigationSteps navigation = new NavigationSteps();
    InshureSteps inshureSteps = new InshureSteps();
    InsuranceSelectionSteps insuranceSelection  = new InsuranceSelectionSteps();
    InsuranceRegistrationSteps insuranceRegistration  = new InsuranceRegistrationSteps();

    HashMap<String, String> testData = new HashMap<>();



    @Test
    public void testTravelInsurance() {
        testData.put("Фамилия застрахованного","INSUREDSURNAME");
        testData.put("Имя застрахованного","INSUREDNAME");
        testData.put("Дата рождения застрахованного","22.07.1992");
        testData.put("Фамилия страхователя","ФАМИЛИЯ");
        testData.put("Имя страхователя","ИМЯ");
        testData.put("Отчество страхователя","ОТЧЕСТВО");
        testData.put("Дата рождения страхователя","22.07.1991");
        testData.put("Серия паспорта","4444");
        testData.put("Номер паспорта","444444");
        testData.put("Дата выдачи паспорта","20.06.2016");
        testData.put("Место выдачи паспорта","ОВД ГОЛЬЯНОВО");


        navigation.selectMenuItem("Страхование");
        navigation.selectSubMenuItem("Путешествия и покупки");
        inshureSteps.checkPageTitle("Страхование путешественников");
        inshureSteps.goToSendAppPage();
        getNewTab();
        insuranceSelection.chooseMinimalPackage();
        insuranceSelection.clickCheckoutButton();
        insuranceRegistration.fillFields(testData);
        insuranceRegistration.chooseFemale();
        insuranceRegistration.checkInsuranceForm(testData);
        insuranceRegistration.conformInsuranceForm();
        insuranceRegistration.checkErrorMassage("Заполнены не все обязательные поля");

    }



}
