package com.capstone.tutorlink.domain.member.command.domain.aggregate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "MEMBER")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_no")
    private Integer memberNo;

    @Column(name = "member_id", length = 20, nullable = false)
    private String memberId;

    @Column(name = "member_pw", length = 100, nullable = false)
    private String memberPw;

    @Column(name = "member_nickname", length = 45, nullable = false)
    private String memberNickname;

    @Column(name = "member_name", length = 45, nullable = false)
    private String memberName;

    @Column(name = "member_email", length = 100, nullable = false)
    private String memberEmail;

    @Column(name = "member_gender", length = 1, nullable = false)
    private String memberGender;

    @Column(name = "member_birthday", nullable = false)
    private Date memberBirthday;

    @Column(name = "member_enroll_date")
    private Date memberEnrollDate;


    @Column(name = "member_current_status", nullable = false)
    private String memberCurrentStatus = "A"; // 기본값 설정

    @Column(name = "member_phone_number", nullable = false)
    private String memberPhoneNumber; // 데이터 타입을 String으로 변경

    @Column(name = "tutor_school_authorize", nullable = false)
    private String tutorSchoolAuthorize ="N";

    @Column(name = "tutor_middle_school", length = 45)
    private String tutorMiddleSchool;

    @Column(name = "tutor_high_school", length = 45)
    private String tutorHighSchool;

    @Column(name = "tutor_uni", length = 45)
    private String tutorUni;

    @Column(name = "tutor_uni_is_enrolled")
    private String  tutorUniIsEnrolled;

    @Column(name = "tutor_major", length = 45)
    private String tutorMajor;

    @Column(name = "tutor_major_num")
    private Integer tutorMajorNum; // 데이터 타입을 Integer로 변경

    @Column(name = "tutor_authorize", length = 45)
    private String tutorAuthorize;

    @Column(name = "my_key", length = 255, nullable = false)
    private String myKey; // my_key를 myKey로 수정

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "member_no")
    public List<MemberRole> memberRoleList = new ArrayList<>();

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", memberPw='" + memberPw + '\'' +
                ", memberNickname='" + memberNickname + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberGender=" + memberGender +
                ", memberBirthday=" + memberBirthday +
                ", memberEnrollDate=" + memberEnrollDate +
                ", memberCurrentStatus='" + memberCurrentStatus + '\'' +
                ", memberPhoneNumber='" + memberPhoneNumber + '\'' +
                ", tutorSchoolAuthorize='" + tutorSchoolAuthorize + '\'' +
                ", tutorMiddleSchool='" + tutorMiddleSchool + '\'' +
                ", tutorHighSchool='" + tutorHighSchool + '\'' +
                ", tutorUni='" + tutorUni + '\'' +
                ", tutorUniIsEnrolled='" + tutorUniIsEnrolled + '\'' +
                ", tutorMajor='" + tutorMajor + '\'' +
                ", tutorMajorNum=" + tutorMajorNum +
                ", tutorAuthorize='" + tutorAuthorize + '\'' +
                ", myKey='" + myKey + '\'' +
                ", memberRoleList=" + memberRoleList +
                '}';
    }
}
