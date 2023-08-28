package form.formbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "form-sign-up")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "ma_sinh_vien", nullable = false, unique = true)
    private String maSinhVien;
    @Column(name = "ho_ten", nullable = false)
    private String hoTen;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "gioi_tinh", nullable = false)
    private String gioiTinh;
    @Column(name = "so_thich", nullable = false)
    private String soThich;
    @Column(name = "quoc_tich", nullable = false)
    private String quocTich;
    @Column(name = "bo_sung", nullable = false)
    private String bosung;
}
