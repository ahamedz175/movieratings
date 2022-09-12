package io.java.movieratings;

//import javax.activation.DataSource;
import javax.sql.DataSource;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

  @Autowired
  public JobBuilderFactory jobBuilderFactory;

  @Autowired
  public StepBuilderFactory stepBuilderFactory;

  @Bean
  public FlatFileItemReader<MovieReviewsInput> reader() {
    return new FlatFileItemReaderBuilder<MovieReviewsInput>()
      .name("personItemReader")
      .resource(new ClassPathResource("ForrestGumpData.csv"))
      .delimited()
      .names(new String[]
    		  {"dataOfReview", "user", "usefulnessVote", "totalVotes", "usersRating", "reviewTitle", "review", "id"}
      )
      .fieldSetMapper(new BeanWrapperFieldSetMapper<MovieReviewsInput>() {{
        setTargetType(MovieReviewsInput.class);
      }})
      .build();
  }
  
  @Bean
  public FlatFileItemReader<MovieReviewsInput> readerTwo() {
    return new FlatFileItemReaderBuilder<MovieReviewsInput>()
      .name("personItemReader")
      .resource(new ClassPathResource("JohnWickData.csv"))
      .delimited()
      .names(new String[]
    		  {"dataOfReview", "user", "usefulnessVote", "totalVotes", "usersRating", "reviewTitle", "review", "id"}
      )
      .fieldSetMapper(new BeanWrapperFieldSetMapper<MovieReviewsInput>() {{
        setTargetType(MovieReviewsInput.class);
      }})
      .build();
  }
  
  
  @Bean
  public FlatFileItemReader<MovieReviewsInput> readerThree() {
    return new FlatFileItemReaderBuilder<MovieReviewsInput>()
      .name("personItemReader")
      .resource(new ClassPathResource("AvengersEndgame.csv"))
      .delimited()
      .names(new String[]
    		  {"dataOfReview", "user", "usefulnessVote", "totalVotes", "usersRating", "reviewTitle", "review", "id"}
      )
      .fieldSetMapper(new BeanWrapperFieldSetMapper<MovieReviewsInput>() {{
        setTargetType(MovieReviewsInput.class);
      }})
      .build();
  }

  @Bean
  public FlatFileItemReader<MovieReviewsInput> readerFour() {
    return new FlatFileItemReaderBuilder<MovieReviewsInput>()
      .name("personItemReader")
      .resource(new ClassPathResource("JokerData.csv"))
      .delimited()
      .names(new String[]
    		  {"dataOfReview", "user", "usefulnessVote", "totalVotes", "usersRating", "reviewTitle", "review", "id"}
      )
      .fieldSetMapper(new BeanWrapperFieldSetMapper<MovieReviewsInput>() {{
        setTargetType(MovieReviewsInput.class);
      }})
      .build();
  }
  
  @Bean
  public FlatFileItemReader<MovieReviewsInput> readerFive() {
    return new FlatFileItemReaderBuilder<MovieReviewsInput>()
      .name("personItemReader")
      .resource(new ClassPathResource("MorbiusData.csv"))
      .delimited()
      .names(new String[]
    		  {"dataOfReview", "user", "usefulnessVote", "totalVotes", "usersRating", "reviewTitle", "review", "id"}
      )
      .fieldSetMapper(new BeanWrapperFieldSetMapper<MovieReviewsInput>() {{
        setTargetType(MovieReviewsInput.class);
      }})
      .build();
  }
  
  @Bean
  public FlatFileItemReader<MovieReviewsInput> readerSix() {
    return new FlatFileItemReaderBuilder<MovieReviewsInput>()
      .name("personItemReader")
      .resource(new ClassPathResource("PulpFictionData.csv"))
      .delimited()
      .names(new String[]
    		  {"dataOfReview", "user", "usefulnessVote", "totalVotes", "usersRating", "reviewTitle", "review", "id"}
      )
      .fieldSetMapper(new BeanWrapperFieldSetMapper<MovieReviewsInput>() {{
        setTargetType(MovieReviewsInput.class);
      }})
      .build();
  }
  
  @Bean
  public FlatFileItemReader<MovieReviewsInput> readerSeven() {
    return new FlatFileItemReaderBuilder<MovieReviewsInput>()
      .name("personItemReader")
      .resource(new ClassPathResource("SpidermanData.csv"))
      .delimited()
      .names(new String[]
    		  {"dataOfReview", "user", "usefulnessVote", "totalVotes", "usersRating", "reviewTitle", "review", "id"}
      )
      .fieldSetMapper(new BeanWrapperFieldSetMapper<MovieReviewsInput>() {{
        setTargetType(MovieReviewsInput.class);
      }})
      .build();
  }
  
  
  @Bean
  public FlatFileItemReader<MovieReviewsInput> readerEight() {
    return new FlatFileItemReaderBuilder<MovieReviewsInput>()
      .name("personItemReader")
      .resource(new ClassPathResource("TheAvengersData.csv"))
      .delimited()
      .names(new String[]
    		  {"dataOfReview", "user", "usefulnessVote", "totalVotes", "usersRating", "reviewTitle", "review", "id"}
      )
      .fieldSetMapper(new BeanWrapperFieldSetMapper<MovieReviewsInput>() {{
        setTargetType(MovieReviewsInput.class);
      }})
      .build();
  }
  
  @Bean
  public FlatFileItemReader<MovieReviewsInput> readerNine() {
    return new FlatFileItemReaderBuilder<MovieReviewsInput>()
      .name("personItemReader")
      .resource(new ClassPathResource("TheDarkKnightData.csv"))
      .delimited()
      .names(new String[]
    		  {"dataOfReview", "user", "usefulnessVote", "totalVotes", "usersRating", "reviewTitle", "review", "id"}
      )
      .fieldSetMapper(new BeanWrapperFieldSetMapper<MovieReviewsInput>() {{
        setTargetType(MovieReviewsInput.class);
      }})
      .build();
  }
  
  @Bean
  public FlatFileItemReader<MovieReviewsInput> readerTen() {
    return new FlatFileItemReaderBuilder<MovieReviewsInput>()
      .name("personItemReader")
      .resource(new ClassPathResource("ThorRagnarokData.csv"))
      .delimited()
      .names(new String[]
    		  {"dataOfReview", "user", "usefulnessVote", "totalVotes", "usersRating", "reviewTitle", "review", "id"}
      )
      .fieldSetMapper(new BeanWrapperFieldSetMapper<MovieReviewsInput>() {{
        setTargetType(MovieReviewsInput.class);
      }})
      .build();
  }
  
  
  
  //int idVal;
  @Bean
  public ForrestGumpDataProcessor processor() {
    return new ForrestGumpDataProcessor();
  }
  
  @Bean
  public JohnWickDataProcessor processorTwo()
  {
	 
    return new JohnWickDataProcessor();
  }
  
  @Bean
  public AvengersEndgameDataProcessor processorThree()
  {
	 
    return new AvengersEndgameDataProcessor();
  }
  
  @Bean
  public JokerDataProcessor processorFour() {
    return new JokerDataProcessor();
  }
  
  @Bean
  public MorbiusDataProcessor processorFive()
  {
	 
    return new MorbiusDataProcessor();
  }
  
  @Bean
  public PulpFictionDataProcessor processorSix()
  {
	 
    return new PulpFictionDataProcessor();
  }
  
  @Bean
  public SpidermanDataProcessor processorSeven()
  {
	 
    return new SpidermanDataProcessor();
  }
  
  @Bean
  public TheAvengersDataProcessor processorEight()
  {
	 
    return new TheAvengersDataProcessor();
  }
  
  @Bean
  public TheDarkKnightDataProcessor processorNine()
  {
	 
    return new TheDarkKnightDataProcessor();
  }
  
  @Bean
  public ThorRagnarokDataProcessor processorTen()
  {
	 
    return new ThorRagnarokDataProcessor();
  }

  @Bean
  public JdbcBatchItemWriter<MovieReviews> writer(DataSource dataSource) {
	  System.out.println("I AM HERE 444444444444");
	  
	    return new JdbcBatchItemWriterBuilder<MovieReviews>()
	      .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
	      .sql("INSERT INTO MOVIEREVIEWS "
	      +"(id, data_of_review, user, usefulness_vote, total_votes, users_rating, review_title, review, movie_name)"+
	      " VALUES (:id, :dataOfReview, :user, :usefulnessVote, :totalVotes, :usersRating, :reviewTitle, :review, :movieName)")
	      .dataSource(dataSource)
	      .build();
  }
  
  
  
  
  /*@Bean
  public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
	  System.out.println("I AM HERE 222222222");
	  return jobBuilderFactory
          .get("importUserJob")
          .incrementer(new RunIdIncrementer())
          .listener(listener)
          .flow(step1)
          .end()
          .build();
  }*/
  
  
  @Bean
  public Job importUserJob(JobCompletionNotificationListener listener, Step step1, Step step2, Step step3, Step step4, Step step5, Step step6, Step step7, Step step8, Step step9, Step step10) {
	  System.out.println("I AM HERE 222222222");
	  return jobBuilderFactory
          .get("importUserJob")
          .incrementer(new RunIdIncrementer())
          .listener(listener)
          .start(step1)
          .next(step2)
          .next(step3)
          .next(step4)
          .next(step5)
          .next(step6)
          .next(step7)
          .next(step8)
          .next(step9)
          .next(step10)
          .build();
  }

  @Bean
  public Step step1(JdbcBatchItemWriter<MovieReviews> writer) {
	  System.out.println("I AM HERE 33333333333333");
      return stepBuilderFactory
          .get("step1")
          .<MovieReviewsInput, MovieReviews>chunk(10)
          .reader(reader())
          .processor(processor())
          .writer(writer)
          .build();
  }
  
  @Bean
  public Step step2(JdbcBatchItemWriter<MovieReviews> writer) {
	  System.out.println("I AM HERE 33333333333333 aaggaaiinn");
      return stepBuilderFactory
          .get("step2")
          .<MovieReviewsInput, MovieReviews>chunk(10)
          .reader(readerTwo())
          .processor(processorTwo())
          .writer(writer)
          .build();
  }
  
  @Bean
  public Step step3(JdbcBatchItemWriter<MovieReviews> writer) {
	  System.out.println("I AM HERE 33333333333333 aaggaaiinn");
      return stepBuilderFactory
          .get("step3")
          .<MovieReviewsInput, MovieReviews>chunk(10)
          .reader(readerThree())
          .processor(processorThree())
          .writer(writer)
          .build();
  }

  @Bean
  public Step step4(JdbcBatchItemWriter<MovieReviews> writer) {
	  System.out.println("I AM HERE 33333333333333");
      return stepBuilderFactory
          .get("step4")
          .<MovieReviewsInput, MovieReviews>chunk(10)
          .reader(readerFour())
          .processor(processorFour())
          .writer(writer)
          .build();
  }
  
  @Bean
  public Step step5(JdbcBatchItemWriter<MovieReviews> writer) {
	  System.out.println("I AM HERE 33333333333333 aaggaaiinn");
      return stepBuilderFactory
          .get("step5")
          .<MovieReviewsInput, MovieReviews>chunk(10)
          .reader(readerFive())
          .processor(processorFive())
          .writer(writer)
          .build();
  }
  
  @Bean
  public Step step6(JdbcBatchItemWriter<MovieReviews> writer) {
	  System.out.println("I AM HERE 33333333333333 aaggaaiinn");
      return stepBuilderFactory
          .get("step6")
          .<MovieReviewsInput, MovieReviews>chunk(10)
          .reader(readerSix())
          .processor(processorSix())
          .writer(writer)
          .build();
  }
  
  @Bean
  public Step step7(JdbcBatchItemWriter<MovieReviews> writer) {
	  System.out.println("I AM HERE 33333333333333");
      return stepBuilderFactory
          .get("step7")
          .<MovieReviewsInput, MovieReviews>chunk(10)
          .reader(readerSeven())
          .processor(processorSeven())
          .writer(writer)
          .build();
  }
  
  @Bean
  public Step step8(JdbcBatchItemWriter<MovieReviews> writer) {
	  System.out.println("I AM HERE 33333333333333 aaggaaiinn");
      return stepBuilderFactory
          .get("step8")
          .<MovieReviewsInput, MovieReviews>chunk(10)
          .reader(readerEight())
          .processor(processorEight())
          .writer(writer)
          .build();
  }
  
  @Bean
  public Step step9(JdbcBatchItemWriter<MovieReviews> writer) {
	  System.out.println("I AM HERE 33333333333333 aaggaaiinn");
      return stepBuilderFactory
          .get("step9")
          .<MovieReviewsInput, MovieReviews>chunk(10)
          .reader(readerNine())
          .processor(processorNine())
          .writer(writer)
          .build();
  }
  
  @Bean
  public Step step10(JdbcBatchItemWriter<MovieReviews> writer) {
	  System.out.println("I AM HERE 33333333333333 aaggaaiinn");
      return stepBuilderFactory
          .get("step3")
          .<MovieReviewsInput, MovieReviews>chunk(10)
          .reader(readerTen())
          .processor(processorTen())
          .writer(writer)
          .build();
  }


}