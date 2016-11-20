## Event5 Endpoint:

### DOMAIN/request

**Method**: `GET`

**Params**:

- event\_type : `string`
- city : `string` 
- start\_time : `string`
- end\_time : `string`

**Response**: `JSON`

**Schema**

```
{
	"data" : [
		{
			"description" : string,
			"endTime" : string,
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
			"startTime" : string,
			"id" : string
		},
		...
	]
}
```
