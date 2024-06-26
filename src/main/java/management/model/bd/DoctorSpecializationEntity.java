package management.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@IdClass(DoctorSpecializationPK.class)
@Table(name = "doctor_specialization")
@Entity
public class DoctorSpecializationEntity {
    @Id
    private long specializationId;
    @Id
    @ManyToOne(targetEntity = DoctorEntity.class, fetch = FetchType.LAZY)
    private long doctorId;

    @Column(columnDefinition = "boolean default true",insertable = false)
    private boolean isActive;
}