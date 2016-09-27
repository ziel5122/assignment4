Feature: Submit
	As a user, I can submit a rating, so that I can get good recommendations

	Scenario Outline: Rating
		When I submit a rating of <rating>
		Then the html should read submitted <text>

		Examples:
			| rating	| text		|
			| 1.5		| submitted 1.5 |
			| 3.7		| submitted 3.7 |
