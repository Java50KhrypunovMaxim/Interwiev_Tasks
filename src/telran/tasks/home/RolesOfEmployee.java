package telran.tasks.home;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RolesOfEmployee {

	  public static List<DateRole> rolesInDates(List<DateRole> datesRoles, List<LocalDate> dates) {
	        List<DateRole> result = new ArrayList<>();
	        for (LocalDate date : dates) {
	            Optional<DateRole> closestRole = datesRoles.stream()
	                    .filter(dateRole -> !dateRole.getDate().isAfter(date))
	                    .max(Comparator.comparing(DateRole::getDate));

	            DateRole res = closestRole.isPresent()
	                    ? new DateRole(closestRole.get().getName(), closestRole.get().getRole(), date)
	                    : new DateRole(null, null, date);

	            result.add(res);
	        }
	        return result;
	}
}
