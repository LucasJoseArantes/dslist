package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//ANOTATION PARA CONFIGURAR MINHA CLASSE PARA SER EQUIVALANTE A TABELA DO BANCO RELACIONAL:
@Entity
// @Table especifica o nome da tabela no banco de dados em que essa entidade será armazenada.
@Table(name = "tb_game")

public class Game {
	
		// Anotation @Id indica que a propriedade id é a chave primária da entidade.
		@Id
		
		//indica que o valor da chave primária será gerado automaticamente pelo banco de dados.
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long id;
		private String title;
		
		@Column(name = "game_year")
		private Integer year;
		private String genre;
		private String platform;
		private String imgUrl;
		private String shortDescrition;
		private String longDescrition;
		
		//O construtor vazio Game() é necessário para fins de mapeamento de entidades.
		public Game() {
			
		}
		
		
		public Game(Long id, String title, String genre, String platform, String imgUrl, String shortDescrition,
				String longDescrition) {
			super();
			this.id = id;
			this.title = title;
			this.genre = genre;
			this.platform = platform;
			this.imgUrl = imgUrl;
			this.shortDescrition = shortDescrition;
			this.longDescrition = longDescrition;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getGenre() {
			return genre;
		}


		public void setGenre(String genre) {
			this.genre = genre;
		}


		public String getPlatform() {
			return platform;
		}


		public void setPlatform(String platform) {
			this.platform = platform;
		}


		public String getImgUrl() {
			return imgUrl;
		}


		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}


		public String getShortDescrition() {
			return shortDescrition;
		}


		public void setShortDescrition(String shortDescrition) {
			this.shortDescrition = shortDescrition;
		}


		public String getLongDescrition() {
			return longDescrition;
		}


		public void setLongDescrition(String longDescrition) {
			this.longDescrition = longDescrition;
		}

		//METODOS DE COMPARAÇÃO DOS GAMES
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Game other = (Game) obj;
			return Objects.equals(id, other.id);
		}

		
		
}
