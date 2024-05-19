package mclientui.proxies;

import mclientui.Dto.PatientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="microservice-patient", url = "localhost:8081")
public interface PatientServiceProxy {
    @GetMapping(value = "/Patients")
    List<PatientDto> patients();
}
