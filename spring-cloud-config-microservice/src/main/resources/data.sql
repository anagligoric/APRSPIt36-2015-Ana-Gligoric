insert into nationality(nationality_name, abbreviation) values ('Serbia', 'SRB');
insert into nationality(nationality_name, abbreviation) values ('Spain', 'ESP');
insert into nationality(nationality_name, abbreviation) values ('United States of America', 'USA');
insert into nationality(nationality_name, abbreviation) values ('Greece', 'GRC');
insert into nationality(nationality_name, abbreviation) values ('Slovenia', 'SLO');
insert into nationality(nationality_name, abbreviation) values ('France', 'FRA');
insert into nationality(nationality_name, abbreviation) values ('Italy', 'ITA');
insert into nationality(nationality_name, abbreviation) values ('Croatia', 'CRO');
insert into nationality(nationality_name, abbreviation) values ('Canada', 'CAN');
insert into nationality(nationality_name, abbreviation) values ('Turkey', 'TUR');
insert into league(league_name, label) values('National basketball association', 'NBA');
insert into league(league_name) values('Superleague');
insert into league(league_name, label) values('Liga Endesa', 'ACB');
insert into league(league_name, label) values('Super Ligi', 'BSL');
insert into league(league_name, label) values('Basketball Bundesleague', 'BBL');
insert into league(league_name, label) values('Lega A', 'LBA');
insert into team(team_name, founded, headquarter, league_id) values('LA Clippers', to_date('01.01.1970', 'dd.mm.yyyy'), 'Los Angeles, California', 1);
insert into team(team_name, founded, headquarter, league_id) values('Denver Nuggets', to_date('01.01.1967', 'dd.mm.yyyy'), 'Denver, Colorado', 1);
insert into team(team_name, founded, headquarter, league_id) values('Crvena Zvezda', to_date('04.03.1945', 'dd.mm.yyyy'), 'Beograd, Srbija', 2);
insert into team(team_name, founded, headquarter, league_id) values('Partizan', to_date('04.10.1945', 'dd.mm.yyyy'), 'Beograd, Srbija', 2);
insert into team(team_name, founded, headquarter, league_id) values('FC Barcelona', to_date('01.01.1899', 'dd.mm.yyyy'), 'Barcelona, Spain', 3);
insert into team(team_name, founded, headquarter, league_id) values('Real Madrid', to_date('06.03.1902', 'dd.mm.yyyy'), 'Madrid, Spain', 3);
insert into team(team_name, founded, headquarter, league_id) values('Fenerbahce Dogus', to_date('03.05.1907', 'dd.mm.yyyy'), 'Istanbul, Turkey', 4);
insert into team(team_name, founded, headquarter, league_id) values('Anadolu Efes', to_date('01.01.1976', 'dd.mm.yyyy'), 'Istanbul, Turkey', 4);
insert into team(team_name, founded, headquarter, league_id) values('FC Bayern Munchen', to_date('01.01.1946', 'dd.mm.yyyy'), 'Munich, Germany', 5);
insert into team(team_name, founded, headquarter, league_id) values('Brose Bamberg', to_date('01.01.1955', 'dd.mm.yyyy'), 'Bamberg, Germany', 5);
insert into team(team_name, founded, headquarter, league_id) values('AX Armani Exchange Olimpia Milan', to_date('01.01.1936', 'dd.mm.yyyy'), 'Milan, Italy', 6);
insert into team(team_name, founded, headquarter, league_id) values('Umana Reyer Venezia', to_date('01.01.1925', 'dd.mm.yyyy'), 'Venice, Italy', 6);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Milos', 'Teodosic', 'LAC/4', to_date('19.03.1987', 'dd.mm.yyyy'),196, 1 , 1);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Danilo', 'Gallinari', 'LAC/8', to_date('08.08.1988', 'dd.mm.yyyy'),208 ,7,1 );
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('DeAndre', 'Jordan', 'LAC/6', to_date('21.07.1988', 'dd.mm.yyyy'), 211, 3, 1);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Patrick', 'Beverly', 'LAC/21', to_date('12.07.1988', 'dd.mm.yyyy'), 186,3, 1);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Wesley', 'Johnson', 'LAC/33', to_date('11.07.1987', 'dd.mm.yyyy'),201, 3 , 1);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Nikola', 'Jokic', 'DN/15', to_date('19.02.1995', 'dd.mm.yyyy'), 208, 1,2 );
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Juancho', 'Hernangomez', 'DN/41', to_date('28.09.1995', 'dd.mm.yyyy'),206, 2 , 2);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Monte', 'Morris', 'DN/11', to_date('27.06.1995', 'dd.mm.yyyy'),191, 3 , 2);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Trey', 'Lyles', 'DN/7', to_date('05.11.1995', 'dd.mm.yyyy'),208, 9, 2);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Jamal', 'Murray', 'DN/27', to_date('23.02.1997', 'dd.mm.yyyy'),193, 9 , 2);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Branko', 'Lazic', 'CZ/10', to_date('12.01.1989', 'dd.mm.yyyy'), 198,1 ,3);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Mathias', 'Lessort', 'CZ/26', to_date('29.09.1995', 'dd.mm.yyyy'),206 , 6,3);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Ognjen', 'Dobric', 'CZ/13', to_date('27.10.1994', 'dd.mm.yyyy'), 200,8 ,3);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Dylan', 'Ennis', 'CZ/31', to_date('26.12.1991', 'dd.mm.yyyy'),188 ,9 ,3);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Alen', 'Omic', 'CZ/23', to_date('26.05.1992', 'dd.mm.yyyy'),216 ,5 ,3);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Novica', 'Velickovic', 'PAR/12', to_date('05.10.1986', 'dd.mm.yyyy'),205 ,1 ,4);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Kwame', 'Vaughn', 'PAR/4', to_date('13.05.1990', 'dd.mm.yyyy'),191 ,3 ,4);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Bandja', 'Sy', 'PAR/5', to_date('30.07.1990', 'dd.mm.yyyy'),204 ,6 ,4);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Strahinja', 'Gavrilovic', 'PAR/17', to_date('05.04.1993', 'dd.mm.yyyy'),204 ,1 ,4);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Vanja', 'Marinkovic', 'PAR/9', to_date('09.01.1997', 'dd.mm.yyyy'),199 ,1 ,4);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Ante', 'Tomic', 'FCB/44', to_date('17.02.1987', 'dd.mm.yyyy'),217 ,8 ,5);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Kevin', 'Seraphin', 'FCB/1', to_date('07.12.1989', 'dd.mm.yyyy'),208 ,6 ,5);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Juan Carlos', 'Navarro', 'FCB/11', to_date('13.06.1980', 'dd.mm.yyyy'),192 ,2 ,5);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Pierre', 'Oriola', 'FCB/18', to_date('25.09.1992', 'dd.mm.yyyy'),208 ,2 ,5);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Thomas', 'Heurtel', 'FCB/13', to_date('10.04.1989', 'dd.mm.yyyy'),189 ,6 ,5);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Ognjen', 'Kuzmic', 'RM/32', to_date('19.05.1990', 'dd.mm.yyyy'),214 ,1 ,6);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Luka', 'Doncic', 'RM/7', to_date('28.02.1999', 'dd.mm.yyyy'),199 ,5 ,6);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Rudy', 'Fernandez', 'RM/5', to_date('04.04.1985', 'dd.mm.yyyy'),196 ,2 ,6);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Fabien', 'Causeur', 'RM/1', to_date('16.06.1987', 'dd.mm.yyyy'),195 ,6 ,6);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Chasson', 'Randle', 'RM/2', to_date('05.02.1993', 'dd.mm.yyyy'),188 ,3 ,6);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Nikola', 'Kalinic', 'FNB/33', to_date('08.11.1991', 'dd.mm.yyyy'),202 ,1 ,7);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Luigi', 'Datome', 'FNB/70', to_date('27.11.1987', 'dd.mm.yyyy'),203 ,7 ,7);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Egehan', 'Arna', 'FNB/18', to_date('05.01.1997', 'dd.mm.yyyy'),203 ,10 ,7);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Kostas', 'Sloukas', 'FNB/16', to_date('15.01.1990', 'dd.mm.yyyy'),190 ,4 ,7);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Baris', 'Hersek', 'FNB/5', to_date('26.03.1988', 'dd.mm.yyyy'),208 ,10 ,7);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Vladimir', 'Å team_idac', 'AE/15', to_date('25.08.1987', 'dd.mm.yyyy'),210 ,1 ,8);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Krunoslav', 'Simon', 'AE/44', to_date('24.06.1985', 'dd.mm.yyyy'),197 ,8 ,8);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Zoran', 'Dragic', 'AE/30', to_date('22.06.1989', 'dd.mm.yyyy'),196 ,5 ,8);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Dogus', 'Balbay', 'AE/4', to_date('21.01.1989', 'dd.mm.yyyy'),185 ,10 ,8);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Derrick', 'Brown', 'AE/5', to_date('08.09.1987', 'dd.mm.yyyy'),203 ,3 ,8);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Stefan', 'Jovic', 'BM/16', to_date('03.11.1990', 'dd.mm.yyyy'),198 ,1 ,9);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Vladimir', 'Lucic', 'BM/11', to_date('17.06.1989', 'dd.mm.yyyy'),202 ,1 ,9);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Reggie', 'Redding', 'BM/15', to_date('18.07.1988', 'dd.mm.yyyy'),193 ,3 ,9);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Anton', 'Gavel', 'BM/25', to_date('24.10.1984', 'dd.mm.yyyy'),189 ,5 ,9);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Jared', 'Conningham', 'BM/9', to_date('22.05.1991', 'dd.mm.yyyy'),195 ,3 ,9);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Daniel', 'Hackett', 'BB/0', to_date('19.12.1987', 'dd.mm.yyyy'),197 ,7 ,10);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Aleksej', 'Nikolic', 'BB/7', to_date('21.02.1995', 'dd.mm.yyyy'),191 ,5 ,10);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Nikos', 'Zisis', 'BB/6', to_date('16.08.1983', 'dd.mm.yyyy'),197 ,4 ,10);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Dejan', 'Musli', 'BB/42', to_date('03.01.1991', 'dd.mm.yyyy'),213 ,1 ,10);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Bryce', 'Taylor', 'BB/44', to_date('27.09.1986', 'dd.mm.yyyy'),195 ,3 ,10);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Vladimir', 'Micov', 'OM/5', to_date('16.04.1985', 'dd.mm.yyyy'),201 ,1 ,11);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Andrea', 'Cinciarini', 'OM/20', to_date('21.0.1986', 'dd.mm.yyyy'),193 ,7 ,11);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Patric', 'Young', 'OM/28', to_date('01.02.1992', 'dd.mm.yyyy'),209 ,3 ,11);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Amath', 'MBay', 'OM/24', to_date('14.12.1989', 'dd.mm.yyyy'),206 ,6 ,11);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Marco', 'Cusin', 'OM/22', to_date('28.02.1985', 'dd.mm.yyyy'),211 ,7 ,11);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Hrvoje', 'Peric', 'URV/2', to_date('25.10.1985', 'dd.mm.yyyy'),203 ,8 ,12);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Michael', 'Bramos', 'URV/6', to_date('27.05.1987', 'dd.mm.yyyy'),196 ,4 ,12);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Andrea', 'De Nicolao', 'URV/10', to_date('21.08.1991', 'dd.mm.yyyy'),185 ,7 ,12);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Michael', 'Jenkins', 'URV/11', to_date('06.09.1986', 'dd.mm.yyyy'),192 ,3 ,12);
insert into player(first_name, last_name, reg_number, date_of_birth, height, nationality_id, team_id) values('Marquez', 'Haynes', 'URV/0', to_date('19.12.1986', 'dd.mm.yyyy'),191 ,3 ,12);