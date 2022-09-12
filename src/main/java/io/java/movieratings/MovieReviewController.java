package io.java.movieratings;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class MovieReviewController {
	
	@Autowired
	private MovieReviewsRepository movieReviewsRepository;
	/*public StartUpController()
	{
		this.startupRepository = startupRepository;
	}*/
	
	
	/*@RequestMapping("/")
    public String start() {
        return "index.html";
    }*/
	
/*	@RequestMapping("/hi")
    public ResponseEntity<?> getTeam( @RequestParam int start,  @RequestParam int end) {
		//Iterable<MovieReviews> c = this.movieReviewsRepository.getMoviesBetweenId(start, end);
		List<MovieReviews> c = this.movieReviewsRepository.findByIdBetween(start, end);
		//MovieReviews val = c.iterator().next();
		System.out.println("touche2");
        return ResponseEntity.ok(c);
    }*/
	
	@RequestMapping("/hi")
    public ResponseEntity<?> getTeam( @RequestParam String name, @RequestParam int pageNum) {
		//Iterable<MovieReviews> c = this.movieReviewsRepository.getMoviesBetweenId(start, end);
		List<MovieReviews> c = this.movieReviewsRepository.findMoviesByPage(name, pageNum);//, pageNum);
		//MovieReviews val = c.iterator().next();


        return ResponseEntity.ok(c);
    }
	
	
	
	
	
	@RequestMapping("/length")
    public ResponseEntity<?> getTeamLength(@RequestParam String name) {
		//Iterable<MovieReviews> c = this.movieReviewsRepository.getMoviesBetweenId(start, end);
		List<MovieReviews> c = this.movieReviewsRepository.getByMovieName(name);
		//MovieReviews val = c.iterator().next();
		System.out.println("touche2");
        return ResponseEntity.ok(c.size());
    }	
	
	//Issue in metadata since due to path usage
	@RequestMapping("/metadata")
	public String getMovieMetadata() throws IOException {
		//Path path = Paths.get("MetadataOfMovies");
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		System.out.println("Current absolute path is: " + s);		
		//Iterable<MovieReviews> c = this.movieReviewsRepository.getMoviesBetweenId(start, end);
		//String content = Files.readString(path, StandardCharsets.US_ASCII);
		String content = "{\r\n"
				+ "	\"value1\": {\r\n"
				+ "		\"title\": \"Avengers Endgame\",\r\n"
				+ "		\"movieIMDbRating\": 8.4,\r\n"
				+ "		\"totalRatingCount\": 1073964,\r\n"
				+ "		\"totalUserReviews\": \"9.5K\",\r\n"
				+ "		\"totalCriticReviews\": \"593\",\r\n"
				+ "		\"metaScore\": \"78\",\r\n"
				+ "		\"movieGenres\": [\"Action\", \"Adventure\", \"Drama\"],\r\n"
				+ "		\"directors\": [\"Anthony Russo\", \"Joe Russo\"],\r\n"
				+ "		\"datePublished\": \"2019-04-26\",\r\n"
				+ "		\"creators\": [\"Christopher Markus\", \"Stephen McFeely\", \"Stan Lee\"],\r\n"
				+ "		\"mainStars\": [\"Robert Downey Jr.\", \"Chris Evans\", \"Mark Ruffalo\"],\r\n"
				+ "		\"description\": \"After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.\",\r\n"
				+ "		\"duration\": 181,\r\n"
				+ "		\"movieName\": \"AvengersEndgame\"\r\n"
				+ "	},\r\n"
				+ "	\"value2\": {\r\n"
				+ "		\"title\": \"Forrest Gump\",\r\n"
				+ "		\"movieIMDbRating\": 8.8,\r\n"
				+ "		\"totalRatingCount\": 2016919,\r\n"
				+ "		\"totalUserReviews\": \"2.9K\",\r\n"
				+ "		\"totalCriticReviews\": \"173\",\r\n"
				+ "		\"metaScore\": \"82\",\r\n"
				+ "		\"movieGenres\": [\"Drama\", \"Romance\"],\r\n"
				+ "		\"directors\": [\"Robert Zemeckis\"],\r\n"
				+ "		\"datePublished\": \"1994-07-06\",\r\n"
				+ "		\"creators\": [\"Winston Groom\", \"Eric Roth\"],\r\n"
				+ "		\"mainStars\": [\"Tom Hanks\", \"Robin Wright\", \"Gary Sinise\"],\r\n"
				+ "		\"description\": \"The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart\",\r\n"
				+ "		\"duration\": 142,\r\n"
				+ "		\"movieName\": \"ForrestGump\"\r\n"
				+ "	},\r\n"
				+ "	\"value3\": {\r\n"
				+ "		\"title\": \"John Wick Chapter 3  Parabellum\",\r\n"
				+ "		\"movieIMDbRating\": 7.4,\r\n"
				+ "		\"totalRatingCount\": 330425,\r\n"
				+ "		\"totalUserReviews\": \"2.4K\",\r\n"
				+ "		\"totalCriticReviews\": \"399\",\r\n"
				+ "		\"metaScore\": \"73\",\r\n"
				+ "		\"movieGenres\": [\"Action\", \"Crime\", \"Thriller\"],\r\n"
				+ "		\"directors\": [\"Chad Stahelski\"],\r\n"
				+ "		\"datePublished\": \"2019-07-05\",\r\n"
				+ "		\"creators\": [\"Derek Kolstad\", \"Shay Hatten\", \"Chris Collins\"],\r\n"
				+ "		\"mainStars\": [\"Keanu Reeves\", \"Halle Berry\", \"Ian McShane\"],\r\n"
				+ "		\"description\": \"John Wick is on the run after killing a member of the international assassins' guild, and with a $14 million price tag on his head, he is the target of hit men and women everywhere.\",\r\n"
				+ "		\"duration\": 130,\r\n"
				+ "		\"movieName\": \"JohnWick\"\r\n"
				+ "	},\r\n"
				+ "	\"value4\": {\r\n"
				+ "		\"title\": \"Joker\",\r\n"
				+ "		\"movieIMDbRating\": 8.4,\r\n"
				+ "		\"totalRatingCount\": 1213550,\r\n"
				+ "		\"totalUserReviews\": \"11.3K\",\r\n"
				+ "		\"totalCriticReviews\": \"697\",\r\n"
				+ "		\"metaScore\": \"59\",\r\n"
				+ "		\"movieGenres\": [\"Crime\", \"Drama\", \"Thriller\"],\r\n"
				+ "		\"directors\": [\"Todd Phillips\"],\r\n"
				+ "		\"datePublished\": \"2019-10-04\",\r\n"
				+ "		\"creators\": [\"Todd Phillips\", \"Scott Silver\", \"Bob Kane\"],\r\n"
				+ "		\"mainStars\": [\"Joaquin Phoenix\", \"Robert De Niro\", \"Zazie Beetz\"],\r\n"
				+ "		\"description\": \"A mentally troubled stand-up comedian embarks on a downward spiral that leads to the creation of an iconic villain.\",\r\n"
				+ "		\"duration\": 122,\r\n"
				+ "		\"movieName\": \"Joker\"\r\n"
				+ "	},\r\n"
				+ "	\"value5\": {\r\n"
				+ "		\"title\": \"Morbius\",\r\n"
				+ "		\"movieIMDbRating\": 5.2,\r\n"
				+ "		\"totalRatingCount\": 90706,\r\n"
				+ "		\"totalUserReviews\": \"1.9K\",\r\n"
				+ "		\"totalCriticReviews\": \"230\",\r\n"
				+ "		\"metaScore\": \"35\",\r\n"
				+ "		\"movieGenres\": [\"Action\", \"Adventure\", \"Horror\"],\r\n"
				+ "		\"directors\": [\"Daniel Espinosa\"],\r\n"
				+ "		\"datePublished\": \"2022-04-01\",\r\n"
				+ "		\"creators\": [\"Matt Sazama\", \"Burk Sharpless\"],\r\n"
				+ "		\"mainStars\": [\"Jared Leto\", \"Matt Smith\", \"Adria Arjona\"],\r\n"
				+ "		\"description\": \"Biochemist Michael Morbius tries to cure himself of a rare blood disease, but he inadvertently infects himself with a form of vampirism instead.\",\r\n"
				+ "		\"duration\": 104,\r\n"
				+ "		\"movieName\": \"Morbius\"\r\n"
				+ "	},\r\n"
				+ "	\"value6\": {\r\n"
				+ "		\"title\": \"Pulp Fiction\",\r\n"
				+ "		\"movieIMDbRating\": 8.9,\r\n"
				+ "		\"totalRatingCount\": 1999600,\r\n"
				+ "		\"totalUserReviews\": \"3.4K\",\r\n"
				+ "		\"totalCriticReviews\": \"297\",\r\n"
				+ "		\"metaScore\": \"94\",\r\n"
				+ "		\"movieGenres\": [\"Crime\", \"Drama\"],\r\n"
				+ "		\"directors\": [\"Quentin Tarantino\"],\r\n"
				+ "		\"datePublished\": \"1994-10-14\",\r\n"
				+ "		\"creators\": [\"Quentin Tarantino\", \"Roger Avary\"],\r\n"
				+ "		\"mainStars\": [\"John Travolta\", \"Uma Thurman\", \"Samuel L. Jackson\"],\r\n"
				+ "		\"description\": \"The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.\",\r\n"
				+ "		\"duration\": 154,\r\n"
				+ "		\"movieName\": \"PulpFiction\"\r\n"
				+ "	},\r\n"
				+ "	\"value7\": {\r\n"
				+ "		\"title\": \"SpiderMan No Way Home\",\r\n"
				+ "		\"movieIMDbRating\": 8.3,\r\n"
				+ "		\"totalRatingCount\": 675951,\r\n"
				+ "		\"totalUserReviews\": \"6K\",\r\n"
				+ "		\"totalCriticReviews\": \"396\",\r\n"
				+ "		\"metaScore\": \"71\",\r\n"
				+ "		\"movieGenres\": [\"Action\", \"Adventure\", \"Fantasy\"],\r\n"
				+ "		\"directors\": [\"Jon Watts\"],\r\n"
				+ "		\"datePublished\": \"2021-12-17\",\r\n"
				+ "		\"creators\": [\"Chris McKenna\", \"Erik Sommers\", \"Stan Lee\"],\r\n"
				+ "		\"mainStars\": [\"Tom Holland\", \"Zendaya\", \"Benedict Cumberbatch\"],\r\n"
				+ "		\"description\": \"With Spider-Man's identity now revealed, Peter asks Doctor Strange for help. When a spell goes wrong, dangerous foes from other worlds start to appear, forcing Peter to discover what it truly means to be Spider-Man.\",\r\n"
				+ "		\"duration\": 148,\r\n"
				+ "		\"movieName\": \"Spiderman\"\r\n"
				+ "	},\r\n"
				+ "	\"value8\": {\r\n"
				+ "		\"title\": \"The Avengers\",\r\n"
				+ "		\"movieIMDbRating\": 8,\r\n"
				+ "		\"totalRatingCount\": 1364943,\r\n"
				+ "		\"totalUserReviews\": \"2K\",\r\n"
				+ "		\"totalCriticReviews\": \"755\",\r\n"
				+ "		\"metaScore\": \"69\",\r\n"
				+ "		\"movieGenres\": [\"Action\", \"Adventure\", \"Sci-Fi\"],\r\n"
				+ "		\"directors\": [\"Joss Whedon\"],\r\n"
				+ "		\"datePublished\": \"2012-05-11\",\r\n"
				+ "		\"creators\": [\"Joss Whedon\", \"Zak Penn\"],\r\n"
				+ "		\"mainStars\": [\"Robert Downey Jr.\", \"Chris Evans\", \"Scarlett Johansson\"],\r\n"
				+ "		\"description\": \"Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.\",\r\n"
				+ "		\"duration\": 143,\r\n"
				+ "		\"movieName\": \"TheAvengers\"\r\n"
				+ "	},\r\n"
				+ "	\"value9\": {\r\n"
				+ "		\"title\": \"The Dark Knight\",\r\n"
				+ "		\"movieIMDbRating\": 9,\r\n"
				+ "		\"totalRatingCount\": 2581534,\r\n"
				+ "		\"totalUserReviews\": \"8.2K\",\r\n"
				+ "		\"totalCriticReviews\": \"436\",\r\n"
				+ "		\"metaScore\": \"84\",\r\n"
				+ "		\"movieGenres\": [\"Action\", \"Crime\", \"Drama\"],\r\n"
				+ "		\"directors\": [\"Christopher Nolan\"],\r\n"
				+ "		\"datePublished\": \"2008-07-18\",\r\n"
				+ "		\"creators\": [\"Jonathan Nolan\", \"Christopher Nolan\", \"David S. Goyer\"],\r\n"
				+ "		\"mainStars\": [\"Christian Bale\", \"Heath Ledger\", \"Aaron Eckhart\"],\r\n"
				+ "		\"description\": \"When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.\",\r\n"
				+ "		\"duration\": 152,\r\n"
				+ "		\"movieName\": \"TheDarkKnight\"\r\n"
				+ "	},\r\n"
				+ "	\"value10\": {\r\n"
				+ "		\"title\": \"Thor Ragnarok\",\r\n"
				+ "		\"movieIMDbRating\": 7.9,\r\n"
				+ "		\"totalRatingCount\": 715040,\r\n"
				+ "		\"totalUserReviews\": \"1.8K\",\r\n"
				+ "		\"totalCriticReviews\": \"462\",\r\n"
				+ "		\"metaScore\": \"74\",\r\n"
				+ "		\"movieGenres\": [\"Action\", \"Adventure\", \"Comedy\"],\r\n"
				+ "		\"directors\": [\"Taika Waititi\"],\r\n"
				+ "		\"datePublished\": \"2017-11-03\",\r\n"
				+ "		\"creators\": [\"Eric Pearson\", \"Craig Kyle\", \"Christopher L. Yost\"],\r\n"
				+ "		\"mainStars\": [\"Chris Hemsworth\", \"Tom Hiddleston\", \"Cate Blanchett\"],\r\n"
				+ "		\"description\": \"Imprisoned on the planet Sakaar, Thor must race against time to return to Asgard and stop Ragnar\\u00f6k, the destruction of his world, at the hands of the powerful and ruthless villain Hela.\",\r\n"
				+ "		\"duration\": 130,\r\n"
				+ "		\"movieName\": \"ThorRagnarok\"\r\n"
				+ "	}\r\n"
				+ "}";
		return content;
    }	
	
}

