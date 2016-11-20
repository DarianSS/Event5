## Event5 Endpoint:

### DOMAIN/request

**Method**: `GET`

**Params**:

- event\_type : `string`
- location\_type : `number`

If location_type == 1:

- radius : `number` 
- latitude : `number` 
- longitude : `number` 

If location_type == 2 send either of these:

- city : `string` 
- area : `string`
- street : `string`

Send the DateTime in ISO-8601 compliant format:

- start_time : `string`
- end_time : `string`

**Response**: `JSON`

**Schema**

```
{
	"data" : [
		{
			"description" : string,
			"end_time" : string,
			"name" : string,
			"place" : {
				"name" : string,
				"location" : {
					"city" : string,
					"country" : string,
					"latitude" : number,
					"longitude" : number,
					"street" : string,
					"zip" : string,
				},
				"id" : string
			},
			"start_time" : string,
			"id" : string
		},
		...
	]
}
```