/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author TRI
 */
public class NhanVien {

        private String id;
        private String username;
        private String password;
        private String name;
        private String date;
        private String position;
        private String email;
        private String address;
        private String phoneNumber;
        private double luongCoDinh = 5000000;

        public NhanVien() {
        }

        public NhanVien(String id, String username, String password, String name, String date, String position, String email, String address, String phoneNumber) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.name = name;
            this.date = date;
            this.position = position;
            this.email = email;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public double getLuongCoDinh() {
            return luongCoDinh;
        }

        public void setLuongCoDinh(double luongCoDinh) {
            this.luongCoDinh = luongCoDinh;
        }

}
