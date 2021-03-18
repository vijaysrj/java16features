package jvaa16features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToList {

	public static void main(String a[]) {


		List<Patient> patientList = new ArrayList<>();

		patientList.add(new Patient("Mr A", 56));
		patientList.add(new Patient("Mrs B", 37));
		patientList.add(new Patient("Mr C", 78));

		// traditional way to filter data - filter patients above age 45

		List<Patient> filteredPatients = new ArrayList<>();
		for (Patient p : patientList) {

			if (p.getAge() > 45) {

				filteredPatients.add(p);

			}
		}
		
		System.out.println("Traditional way");
		System.out.println(filteredPatients);
		
		
		
		//using Collectors.toList()
		System.out.println("Collectors to List");
		
		List<Patient> filteredPatientUsingCollectors = patientList.stream().filter(p -> p.getAge() > 45).collect(Collectors.toList());
		Patient patientne = new Patient("Mr D",89);
		filteredPatientUsingCollectors.set(1, patientne);
		System.out.println(filteredPatientUsingCollectors);
		
		
		
		System.out.println("Stream ToList");
		
		List<Patient> filteredPatientsUsingStreamToList = patientList.stream().filter(p -> p.getAge() > 45).toList();
		
		Patient patientnew  = new Patient("Mr E",89);
		filteredPatientsUsingStreamToList.set(1, patientnew);
		System.out.println(filteredPatientsUsingStreamToList);
		
		

	}
}
