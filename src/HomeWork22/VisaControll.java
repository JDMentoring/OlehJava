package HomeWork22;

import java.sql.SQLOutput;

public class VisaControll {
    public static void showTransitVisaInfo(VisaCenter<? extends TransitVisa> visaCenter) {
        for (int i = 0; i < visaCenter.getVises().size(); i++) {
            System.out.println(visaCenter.getVises().get(i).getName());
            System.out.println(visaCenter.getVises().get(i).getSurname());
            System.out.println(visaCenter.getVises().get(i).getCountry());
            System.out.println(visaCenter.getVises().get(i).getIssuanceDate());
            System.out.println(visaCenter.getVises().get(i).getPeriod());
        }
    }

    public static void showNationaltVisaInfo(VisaCenter<? extends NationalVisa> visaCenter) {
        for (int i = 0; i < visaCenter.getVises().size(); i++) {
            System.out.println(visaCenter.getVises().get(i).getRemarks());
            System.out.println(visaCenter.getVises().get(i).getId());
        }
    }

    public static void showInternationalVisaInfo(VisaCenter<? extends InternationalVisa> visaCenter) {
        for (int i = 0; i < visaCenter.getVises().size(); i++) {
            System.out.println(visaCenter.getVises().get(i).getContractCountries());
        }
    }
}
