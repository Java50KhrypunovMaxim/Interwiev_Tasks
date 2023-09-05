package telran.tasks.home;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InterviewTaskTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void displayShuffledTest() {
		int ar[] = {0, 1, 2, 3, 4, 5};
		InterviewTasks.displayShuffled(ar);
		InterviewTasks.displayShuffled(ar);
		InterviewTasks.displayShuffled(ar);
		InterviewTasks.displayShuffled(ar);
		InterviewTasks.displayShuffled(ar);
		InterviewTasks.displayShuffled(ar);
	
	}
	@Test
	
	void rolesInDatesTest() {
        List<DateRole> datesRoles = new ArrayList<>();
        datesRoles.add(new DateRole("Max", "Developer", LocalDate.of(2017, 03, 15)));
        datesRoles.add(new DateRole("Max", "Team Leader", LocalDate.of(2020, 01, 01)));
        datesRoles.add(new DateRole("Max", "Project Manager", LocalDate.of(2023, 03, 15)));
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2023, 04, 01));

        List<DateRole> result = RolesOfEmployee.rolesInDates(datesRoles, dates);

        System.out.println(result);
    }

     


}
