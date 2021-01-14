INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Ana Maria','ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_genre (name) VALUES ('Ação');
INSERT INTO tb_genre (name) VALUES ('Ficção');
INSERT INTO tb_genre (name) VALUES ('Aventura');


INSERT INTO tb_movie (tittle, sub_Tittle, year, img_Url, synopsis, genre_id) VALUES ('The Lord of the Rings', 'As Duas Torres', 2003, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/kWYfW2Re0rUDE6IHhy4CRuKWeFr.jpg', 'Esta é a continuação da trilogia "O Senhor dos Anéis", baseada no romance épico que J.R.R. Tolkien escreveu após sua passagem pelas trincheiras da Primeira Guerra Mundial. Este filme foi filmado pelo mesmo elenco e equipa do primeiro filme, "A Irmandade do Anel", uma estratégia que deu grande coesão à trilogia.', 3);
INSERT INTO tb_movie (tittle, sub_Tittle, year, img_Url, synopsis, genre_id) VALUES ('Tenet', 'O tempo acaba', 2020, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/wzJRB4MKi3yK138bJyuL9nx47y6.jpg', 'Armado com apenas uma palavra – Tenet – e lutando pela sobrevivência do mundo inteiro, o Protagonista viaja através de um mundo crepuscular de espionagem internacional em uma missão que irá desenrolar em algo para além do tempo real.', 2);
INSERT INTO tb_movie (tittle, sub_Tittle, year, img_Url, synopsis, genre_id) VALUES ('Agentes Vanguard', 'Jack chan', 2020, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/1jDrptZFBXBlmMwARa1TjCFJrgq.jpg', 'A empresa de segurança secreta Vanguard é a última esperança de sobrevivência para um contador, depois que ele é alvo da organização mercenária mais mortal do mundo.', 1);
INSERT INTO tb_movie (tittle, sub_Tittle, year, img_Url, synopsis, genre_id) VALUES ('Battleship: A Batalha dos Mares', 'Battleship: A Batalha dos Mares', 2012, 'https://www.themoviedb.org/t/p/w220_and_h330_face/vUTrHashD5jrUdQhwtpWzlmyyZf.jpg', 'A equipe comandada pelo almirante Shane está a bordo do navio USS John Paul Jones. Em alto mar, eles se deparam com uma ameça alienígena. Para defender o planeta, eles precisam unir forças com a tripulação de outro navio e também com os cientistas comandados por Cal Zapata.', 1);
INSERT INTO tb_movie (tittle, sub_Tittle, year, img_Url, synopsis, genre_id) VALUES ('Mulher Maravilha', '1984', 2020, 'https://www.themoviedb.org/t/p/w220_and_h330_face/qDA95ebiy3W3m8hTRB3xZNZVVBM.jpg', 'Em 1984, Diana Prince entra em conflito com dois inimigos formidáveis, Maxwell Lord e a Mulher-Leopardo, enquanto reencontra misteriosamente com seu antigo interesse amoroso Steve Trevor.', 3);
INSERT INTO tb_movie (tittle, sub_Tittle, year, img_Url, synopsis, genre_id) VALUES ('Interestelar', 'O fim da terra não será o nosso fim', 2014, 'https://www.themoviedb.org/t/p/w220_and_h330_face/nCbkOyOMTEwlEV0LtCOvCnwEONA.jpg', 'As reservas naturais da Terra estão chegando ao fim e um grupo de astronautas recebe a missão de verificar possíveis planetas para receberem a população mundial, possibilitando a continuação da espécie. Cooper é chamado para liderar o grupo e aceita a missão sabendo que pode nunca mais ver os filhos. Ao lado de Brand, Jenkins e Doyle, ele seguirá em busca de um novo lar.', 2);
INSERT INTO tb_movie (tittle, sub_Tittle, year, img_Url, synopsis, genre_id) VALUES ('Os Vingadores', 'Os maiores heróis da terra juntos', 2012, 'https://www.themoviedb.org/t/p/w220_and_h330_face/u49fzmIJHkb1H4oGFTXtBGgaUS1.jpg', 'Loki, o irmão de Thor, ganha acesso ao poder ilimitado do cubo cósmico ao roubá-lo de dentro das instalações da S.H.I.E.L.D. Nick Fury, o diretor desta agência internacional que mantém a paz, logo reúne os únicos super-heróis que serão capazes de defender a Terra de ameaças sem precedentes. Homem de Ferro, Capitão América, Hulk, Thor, Viúva Negra e Gavião Arqueiro formam o time dos sonhos de Fury, mas eles precisam aprender a colocar os egos de lado e agir como um grupo em prol da humanidade.', 3);
INSERT INTO tb_movie (tittle, sub_Tittle, year, img_Url, synopsis, genre_id) VALUES ('Os Vingadores', 'Ultimato', 2019, 'https://www.themoviedb.org/t/p/w220_and_h330_face/q6725aR8Zs4IwGMXzZT8aC8lh41.jpg', 'Após os eventos devastadores de "Vingadores: Guerra Infinita", o universo está em ruínas devido aos esforços do Titã Louco, Thanos. Com a ajuda de aliados remanescentes, os Vingadores devem se reunir mais uma vez a fim de desfazer as ações de Thanos e restaurar a ordem no universo de uma vez por todas, não importando as consequências.', 3);
INSERT INTO tb_movie (tittle, sub_Tittle, year, img_Url, synopsis, genre_id) VALUES ('Os Vingadores', 'Guerra Infinita', 2018, 'https://www.themoviedb.org/t/p/w220_and_h330_face/89QTZmn34iwXYeCpVxhC9UrT8sX.jpg', 'Homem de Ferro, Thor, Hulk e os Vingadores se unem para combater seu inimigo mais poderoso, o maligno Thanos. Em uma missão para coletar todas as seis pedras infinitas, Thanos planeja usá-las para infligir sua vontade maléfica sobre a realidade.', 3);
INSERT INTO tb_movie (tittle, sub_Tittle, year, img_Url, synopsis, genre_id) VALUES ('Liga da Justiça', 'Liga da Justiça de Zack Snyder', 2021, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/yDIBJeg0zEPiD0TxxrUQr1ChyxI.jpg', 'The four-hour-long directors cut of the 2017 American superhero film Justice League. Following the death of Superman, Batman and Wonder Woman recruit the Flash, Aquaman, and Cyborg to form the Justice League and protect the world from Steppenwolf.', 3);

INSERT INTO tb_review (text, user_id, movie_id) VALUES ('O filmes é muito bom, Nolan mandou muito bem novamente', '2', '2');
INSERT INTO tb_review (text, user_id, movie_id) VALUES ('O filmes é muito bom, concerteza um dos melhores de todos os tempos', '2', '1');