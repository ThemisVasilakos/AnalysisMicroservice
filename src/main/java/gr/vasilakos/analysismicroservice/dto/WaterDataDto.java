package gr.vasilakos.analysismicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WaterDataDto {

    private Double dissolvedOxygen;
    private Double oxidationReductionPotential;
    private Double pH;
    private Double turbidity;
    private Double totalDissolvedSolids;
    private Double temperature;
    private Instant timestamp;
    private String coordinates;
}
